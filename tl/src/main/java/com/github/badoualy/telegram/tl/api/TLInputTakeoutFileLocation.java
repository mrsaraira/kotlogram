package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputTakeoutFileLocation extends TLAbsInputFileLocation {
    public static final int CONSTRUCTOR_ID = 0x29be5899;

    private final String _constructor = "inputTakeoutFileLocation#29be5899";

    public TLInputTakeoutFileLocation() {
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
