package main.designPatterns.bridge3.impl;

public interface AbstractList<T> {

  public void addElement(T obj);

  public int insertElement(T obj, int i);

  public T deleteElement(int i);

  public T getElement(int i);

  public int getElementSize();
}
