package com.github.badoualy.telegram.tl.api.storage;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLFileGif extends TLAbsFileType {
    public static final int CONSTRUCTOR_ID = 0xcae1aadf;

    private final String _constructor = "storage.fileGif#cae1aadf";

    public TLFileGif() {
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
