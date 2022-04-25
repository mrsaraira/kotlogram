package com.github.badoualy.telegram.tl.api.help;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLCountriesListNotModified extends TLAbsCountriesList {
    public static final int CONSTRUCTOR_ID = 0x93cc1f32;

    private final String _constructor = "help.countriesListNotModified#93cc1f32";

    public TLCountriesListNotModified() {
    }

    @Override
    public String toString() {
        return _constructor;
    }

    @Override
    public int getConstructorId() {
        return CONSTRUCTOR_ID;
    }
}
