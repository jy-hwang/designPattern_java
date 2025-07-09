package main.designPatterns.bridge3.test;

import main.designPatterns.bridge3.impl.ArrayImpl;
import main.designPatterns.bridge3.impl.LinkedListImpl;
import main.designPatterns.bridge3.list.Queue;
import main.designPatterns.bridge3.list.Stack;

public class BridgeTest {
  public static void main(String[] args) {
    Stack<String> linkedListStack = new Stack<String>(new LinkedListImpl<String>());
    linkedListStack.push("aaa");
    linkedListStack.push("bbb");
    linkedListStack.push("ccc");

    System.out.println(linkedListStack.toString());
    System.out.println(linkedListStack.pop());
    System.out.println(linkedListStack.pop());
    System.out.println(linkedListStack.pop());
    System.out.println(linkedListStack.toString());
    System.out.println("======================");

    Stack<String> arrayStack = new Stack<String>(new ArrayImpl<String>());

    arrayStack.push("aaa");
    arrayStack.push("bbb");
    arrayStack.push("ccc");

    System.out.println(arrayStack.toString());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.pop());
    System.out.println(arrayStack.toString());
    System.out.println("======================");

    Queue<String> arrayQueue = new Queue<String>(new ArrayImpl<String>());
    arrayQueue.enQueue("aaa");
    arrayQueue.enQueue("bbb");
    arrayQueue.enQueue("ccc");

    System.out.println(arrayQueue.toString());
    System.out.println(arrayQueue.deQueue());
    System.out.println(arrayQueue.deQueue());
    System.out.println(arrayQueue.deQueue());
    System.out.println(arrayQueue.toString());
    System.out.println("======================");

    Queue<String> linkedQueue = new Queue<String>(new LinkedListImpl<String>());

    linkedQueue.enQueue("aaa");
    linkedQueue.enQueue("bbb");
    linkedQueue.enQueue("ccc");

    System.out.println(linkedQueue.toString());
    System.out.println(linkedQueue.deQueue());
    System.out.println(linkedQueue.deQueue());
    System.out.println(linkedQueue.deQueue());
    System.out.println(linkedQueue.toString());
    System.out.println("======================");

  }
}
