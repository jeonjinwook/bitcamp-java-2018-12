package ch29.g;

import java.beans.PropertyEditorSupport;

public class MyCustomBlackBoxEditor extends PropertyEditorSupport {
  @Override
  public void setAsText(String text) throws IllegalArgumentException {
    String[] texts = text.split(",");
    
    BlackBox blackBox = new BlackBox();
    blackBox.setMaker(texts[0]);
    blackBox.setModel(texts[1]);
    
    this.setValue(blackBox);
  }
}
