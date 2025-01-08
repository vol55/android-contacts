package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<T> {
    boolean theSameAs(T o);

    @Override
    boolean equals(Object o);
}
