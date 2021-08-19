package ru.model.staff;

public abstract class Staff {

    private Long id;

    protected Staff() {
    }

    protected Staff(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
