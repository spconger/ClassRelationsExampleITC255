package com.spconger;

public interface IGame {
  Card deal();
  void turn(Player player);
  int turnResult();
}
