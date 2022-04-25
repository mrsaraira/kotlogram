package com.github.badoualy.telegram.tl.api.account;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import java.lang.Override;
import java.lang.String;

public class TLResetPasswordOk extends TLAbsResetPasswordResult {
    public static final int CONSTRUCTOR_ID = 0xe926d63e;

    private final String _constructor = "account.resetPasswordOk#e926d63e";

    public TLResetPasswordOk() {
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
