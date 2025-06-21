package com.library.management.model;


// @Entity
// @NoArgsConstructor
// @AllArgsConstructor
public class Book {

    private Long id;
    private String title;
    private String author;
    private String isbn;
    private boolean available = true;
    public void setAvailable(boolean b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setAvailable'");
    }
    public boolean isAvailable() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAvailable'");
    }
}
