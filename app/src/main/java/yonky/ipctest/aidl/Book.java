package yonky.ipctest.aidl;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Administrator on 2018/4/14.
 */

public class Book implements Parcelable {
    public int bookId;
    public String bookName;

    public Book(int bookId, String bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int i) {
        out.writeInt(bookId);
        out.writeString(bookName);
    }

    public static final Parcelable.Creator<Book> CREATOR= new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel parcel) {
            return new Book(parcel);
        }

        @Override
        public Book[] newArray(int i) {
            return new Book[i];
        }
    };

    private Book(Parcel parcel){
        bookId=parcel.readInt();
        bookName= parcel.readString();
    }

}

