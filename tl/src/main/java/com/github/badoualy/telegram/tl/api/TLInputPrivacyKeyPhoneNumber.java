package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPrivacyKeyPhoneNumber extends TLAbsInputPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0x352dafa;

    private final String _constructor = "inputPrivacyKeyPhoneNumber#352dafa";

    public TLInputPrivacyKeyPhoneNumber() {
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
