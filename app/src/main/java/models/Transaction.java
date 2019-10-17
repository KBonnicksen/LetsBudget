package models;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;

@Entity(tableName = "Transactions")
public class Transaction {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "transactionID")
    private Long ID;

    @ColumnInfo(name = "month")
    private int month;          // Change to a month object?

    @ColumnInfo(name = "cost")
    private double cost;

    @ColumnInfo(name = "category")
    private String category;    //Change this to a category object

    @ColumnInfo(name = "description")
    private String description;

    public Transaction(){
        this.ID = ID;
        month = Calendar.getInstance().get(Calendar.MONTH);
    }

    public Transaction(double amount, String description){
        this();
        this.cost = amount;
        this.description = description;
    }

    public Long getID(){
        return ID;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public int getMonth(){
        return this.month;
    }

    public void setID(@NonNull Long id){
        this.ID = id;
    }
}
