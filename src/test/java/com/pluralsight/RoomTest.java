package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    void checkin_test_method_for_vacant_and_clean_to_return_false() {
        // arrange/setup
        Room room1 = new Room(10, 120);

        //action
        room1.isCheckedIn();

        // assertion
        assertFalse(room1.isVacant());
        assertFalse(room1.isClean());

    }

    @Test
    void testing_checkedout_after_running_checkedin() {
        Room room2 = new Room(10,20);

        room2.isCheckedIn();
        room2.isCheckedOut();

        assertFalse(room2.isClean());
        assertTrue(room2.isVacant());
    }

    @Test
    void testing_checkedout_to_see_if_room_is_vacant() {
        Room room2 = new Room(10,20);

        room2.isCheckedOut();

        assertTrue(room2.isVacant());
    }


    @Test
    void testing_isClean_to_see_if_room_is_clean() {
        Room room3 = new Room(10,30);

        room3.isCleanRoom();

        assertTrue(room3.isClean());
    }

    @Test
    void testing_isClean_to_see_if_room_is_clean_after_checkedout() {
        Room room3 = new Room(10,30);

        room3.isCheckedOut();
        room3.isCleanRoom();

        assertTrue(room3.isClean());
    }

    @Test
    void testing_isClean_to_see_if_room_is_clean_and_vacant_after_checkedin_and_checkedout() {
        Room room3 = new Room(10,30);

        room3.isCheckedIn();
        room3.isCheckedOut();
        room3.isCleanRoom();

        assertTrue(room3.isClean());
        assertTrue(room3.isVacant());
    }

}