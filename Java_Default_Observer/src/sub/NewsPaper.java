package sub;

public class NewsPaper extends java.util.Observable {
  /**
   * 報紙的實際內容
   */
  private String content;
  /**
   * 獲得報紙的實際內容
   * @return 報紙的實際內容
   */
  public String getContent() {
    return content;
  }
  /**
   * 設定報紙的實際內容
   * @param content 報紙的實際內容
   */
  public void setContent(String content) {
    this.content = content;
    // 內容新增 代表出了新的報紙 通知所有讀者
    this.setChanged();
    // 主動通知 這是推的方式
    this.notifyObservers(this.content);
    // 如果是拉的方式是以下呼叫方式
    // this.notifyObservers();
  }
}
