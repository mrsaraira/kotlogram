package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputChatPhotoEmpty extends TLAbsInputChatPhoto {
    public static final int CONSTRUCTOR_ID = 0x1ca48f57;

    private final String _constructor = "inputChatPhotoEmpty#1ca48f57";

    public TLInputChatPhotoEmpty() {
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
