package dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Transaction;
import androidx.room.Update;

@Dao
public interface TransactionDAO  {
    @Insert
    public void insert(Transaction tran);
    @Update
    public void update(Transaction tran);
    @Delete
    public void delete(Transaction tran);
}
