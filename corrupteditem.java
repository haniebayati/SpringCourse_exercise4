package ir.freeland.springboot.relation.onetoone.foreignkeybased;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "corrupteditem")

public class corrupteditem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "ITEM_NAME", length = 50, nullable = false, unique = false)
	private String itemname;
	 @OneToOne(cascade = CascadeType.ALL) //There will be a unique constraint 
	    @JoinColumn(name = "item_id", referencedColumnName = "id")
	    private item item;
	    
	 @Column(name="reason")
	    private String reason;

	    
	    public String getreason() {
	        return reason;
	    }

	    public void setreason(String reason) {
	        this.reason = reason;
	    }

}
