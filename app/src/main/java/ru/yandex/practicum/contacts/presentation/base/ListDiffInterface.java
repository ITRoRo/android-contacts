package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface<S> {
    boolean theSameAs(S s);

    boolean equals(Object o);
}

