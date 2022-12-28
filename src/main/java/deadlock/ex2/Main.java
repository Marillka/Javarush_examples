package deadlock.ex2;

import java.util.ArrayList;

/*
Допустим, первая нить вызвала метод getFriends, тогда она сначала захватит мютекс объекта this, а затем мютекс объекта friends.

Вторая нить при этом вызвала метод addFriend, она сначала захватывает мютекс объекта friends, а затем мютекс объекта this (при вызове getFriendsCount).

Сначала все будет хорошо, но как гласит Закон Мерфи — если неприятность может случиться, она случается. Обязательно возникнет ситуация, когда первая нить успеет захватить только один мютекс, а вторая нить в это время захватит второй. Они так и будут висеть вечно в ожидании, что кто-то из них первым освободит мютекс.
 */

public class Main {
    public static void main(String[] args) {


    }

    public class Student {
        private ArrayList friends = new ArrayList();

        public synchronized ArrayList getFriends() {
            synchronized (friends) {
                return new ArrayList(friends);
            }
        }

        public synchronized int getFriendsCount() {
            return friends.size();
        }

        public int addFriend(Student student) {
            synchronized (friends) {
                friends.add(student);
                return getFriendsCount();
            }
        }
    }
}
