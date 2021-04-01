import obs.Reader;
import sub.NewsPaper;

public class Client {
    public static void main(String[] args) throws Exception {
        // 建立一個報紙 作為被觀察者
        NewsPaper subject = new NewsPaper();
        // 建立一個讀者 作為觀察者
        Reader reader1 = new Reader();
        reader1.setName("張三");
        Reader reader2 = new Reader();
        reader2.setName("李四");
        Reader reader3 = new Reader();
        reader3.setName("王五");
        // 註冊讀者
        subject.addObserver(reader1);
        subject.addObserver(reader2);
        subject.addObserver(reader3);
        // 推出內容
        subject.setContent("本期內容是觀察者模式");
    }
}
