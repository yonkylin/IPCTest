// IBookManager.aidl
package yonky.ipctest.aidl;

// Declare any non-default types here with import statements
import yonky.ipctest.aidl.Book;
interface IBookManager {

  List<Book> getBookList();
  void addBook(in Book book);
}
