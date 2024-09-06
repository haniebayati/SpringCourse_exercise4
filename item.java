package ir.freeland.springboot.relation.onetoone.foreignkeybased;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "item")

public class item {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "ITEM_NAME", length = 50, nullable = false, unique = false)
	private String itemname;
    
	@Transient
    @Column(name = "price")
    private Integer  price;
    @Column(name="category")
    private String category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getitemname() {
        return itemname;
    }
 
    public void setitemname(String itemname) {
        this.itemname = itemname;
    }

    public String getcategory() {
        return category;
    }

    public void setcategory(String category) {
        this.category = category;
    }
	
    public long getprice() {
        return price;
    }
 
    public void setprice(Integer  price) {
        this.price = price;
    }
	
}
