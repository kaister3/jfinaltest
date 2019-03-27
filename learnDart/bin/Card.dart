class Card {
  String name;
  String type;

  Card(this.name, this.type);
  //dart 的语法糖之二：更方便的构造方法

  @override
  String toString() {
    return 'Card{name: $name, type: $type';
  }
}