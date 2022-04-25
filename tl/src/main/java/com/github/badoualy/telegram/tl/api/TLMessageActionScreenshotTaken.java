package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLMessageActionScreenshotTaken extends TLAbsMessageAction {
    public static final int CONSTRUCTOR_ID = 0x4792929b;

    private final String _constructor = "messageActionScreenshotTaken#4792929b";

    public TLMessageActionScreenshotTaken() {
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
