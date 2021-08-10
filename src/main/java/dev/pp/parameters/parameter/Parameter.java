package dev.pp.parameters.parameter;

import dev.pp.parameters.formalParameter.FormalParameter;
import dev.pp.text.annotations.NotNull;
import dev.pp.text.annotations.Nullable;

public class Parameter<T> {


    private final @NotNull String name;
    private final T value;
    private final @Nullable FormalParameter<T> formalParameter;


    public Parameter ( @NotNull String name, T value, @Nullable FormalParameter<T> formalParameter ) {

        this.name = name;
        this.value = value;
        this.formalParameter = formalParameter;
    }

    public Parameter ( @NotNull String name, T value ) {

        this ( name, value, null );
    }


    public @NotNull String getName () { return name; }

    public T getValue () { return value; }

    public @Nullable FormalParameter<T> getFormalParameter () { return formalParameter; }


    @Override public @NotNull String toString() { return name + ": " + value; }
}
