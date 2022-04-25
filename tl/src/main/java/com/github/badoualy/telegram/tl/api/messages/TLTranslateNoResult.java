package com.github.badoualy.telegram.tl.api.messages;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLTranslateNoResult extends TLAbsTranslatedText {
    public static final int CONSTRUCTOR_ID = 0x67ca4737;

    private final String _constructor = "messages.translateNoResult#67ca4737";

    public TLTranslateNoResult() {
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
