package obs;

import java.util.Observable;

public class Reader implements java.util.Observer {

  /**
   * 讀者的姓名
   */
  private String name;
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public void update(Observable o, Object obj) {
    // 這裡是採用推的方式
    System.out.println(name + "收到報紙了 先閱讀 目標推過來的內容是 ====" + obj);
    // 這是獲得拉的資料
    System.out.println(name + "收到報紙了 閱讀它 主動到目標去拉的內容是 ====" + obj);
  }
  
}
