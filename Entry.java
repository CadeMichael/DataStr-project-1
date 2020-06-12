/**
 * Entry is the abstract class that must be extended by any Object stored in the bank queue as it 
 * has a position field
 * @author Cade Lueker
 */
public abstract class Entry {
  /** position will be initiated when the entry is added to the queue and holds the number of items added before*/
  private int position;
  
  /** 
   * returns the position of the entry
   * @return position
   */
  public int getPosition() {
    return this.position;
  }
  
  /**
   * set the position of the entry
   * @param pos is the position that will be set to position
   */
  public void setPosition(int pos) {
    this.position = pos;
  }
}