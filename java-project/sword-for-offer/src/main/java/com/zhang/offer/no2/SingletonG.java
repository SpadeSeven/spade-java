package com.zhang.offer.no2;

/**
 * Created by Administrator on 2019-04-01.
 *
 * <p>双重校验锁
 */
public class SingletonG {

  private static volatile SingletonG instance;

  private SingletonG() {}

  public static SingletonG getInstance() {
    if (instance == null) {
      synchronized (SingletonG.class) {
        if (instance == null) {
          instance = new SingletonG();
        }
      }
    }
    return instance;
  }
}
