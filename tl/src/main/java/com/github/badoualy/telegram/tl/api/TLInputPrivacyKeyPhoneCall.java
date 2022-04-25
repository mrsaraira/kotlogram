package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLInputPrivacyKeyPhoneCall extends TLAbsInputPrivacyKey {
    public static final int CONSTRUCTOR_ID = 0xfabadc5f;

    private final String _constructor = "inputPrivacyKeyPhoneCall#fabadc5f";

    public TLInputPrivacyKeyPhoneCall() {
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
