package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;
import java.lang.String;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLInputKeyboardButtonUrlAuth}: inputKeyboardButtonUrlAuth#d02e7fd4</li>
 * <li>{@link TLInputKeyboardButtonUserProfile}: inputKeyboardButtonUserProfile#e988037b</li>
 * <li>{@link TLKeyboardButton}: keyboardButton#a2fa4880</li>
 * <li>{@link TLKeyboardButtonBuy}: keyboardButtonBuy#afd93fbb</li>
 * <li>{@link TLKeyboardButtonCallback}: keyboardButtonCallback#35bbdb6b</li>
 * <li>{@link TLKeyboardButtonGame}: keyboardButtonGame#50f41ccf</li>
 * <li>{@link TLKeyboardButtonRequestGeoLocation}: keyboardButtonRequestGeoLocation#fc796b3f</li>
 * <li>{@link TLKeyboardButtonRequestPhone}: keyboardButtonRequestPhone#b16a6c29</li>
 * <li>{@link TLKeyboardButtonRequestPoll}: keyboardButtonRequestPoll#bbc7515d</li>
 * <li>{@link TLKeyboardButtonSwitchInline}: keyboardButtonSwitchInline#568a748</li>
 * <li>{@link TLKeyboardButtonUrl}: keyboardButtonUrl#258aff05</li>
 * <li>{@link TLKeyboardButtonUrlAuth}: keyboardButtonUrlAuth#10b78d29</li>
 * <li>{@link TLKeyboardButtonUserProfile}: keyboardButtonUserProfile#308660c1</li>
 * </ul>
 *
 */
public abstract class TLAbsKeyboardButton extends TLObject {
    protected String text;

    public TLAbsKeyboardButton() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
