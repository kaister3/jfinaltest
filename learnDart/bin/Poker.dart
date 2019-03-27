import 'dart:math';

import 'Card.dart';

class Poker {
  static const List<String> POKER_NAMES = const [
    'A', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K'];
  static const List<String> CARD_TYPES = const['♠', '♣', '︎♥', '︎♦︎'];
  List<Card> _cards;

  Poker(){
    _cards = new List<Card>();
    _cards.add(new Card('大王', null));
    _cards.add(new Card('小王', null));
    for (String type in CARD_TYPES) {
      for (String name in POKER_NAMES) {
        _cards.add(new Card(name, type));
      }
    }
  }

  get cards => _cards;
  //dart 的语法糖之一：更方便的 getter 与 setter
}