package org.example.LessonSix.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> book  = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        book.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return book.getOrDefault(lastName, new ArrayList<>());
    }
}