package main.designPatterns.bridge3.impl;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T> {

  ArrayList<T> array;

  public ArrayImpl() {
    array = new ArrayList<T>();
    System.out.println("Array 로 구현합니다.");
  }

  @Override
  public void addElement(T obj) {
    array.add(obj);
  }

  @Override
  public int insertElement(T obj, int i) {
    array.add(i, obj);
    return i;
  }

  @Override
  public T deleteElement(int i) {
    return array.remove(i);
  }

  @Override
  public T getElement(int i) {
    return array.get(i);
  }

  @Override
  public int getElementSize() {
    return array.size();
  }

  public String toString() {
    return array.toString();
  }
}
