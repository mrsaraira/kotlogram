package com.github.badoualy.telegram.tl.api;

import static com.github.badoualy.telegram.tl.StreamUtils.*;
import static com.github.badoualy.telegram.tl.TLObjectUtils.*;

import com.github.badoualy.telegram.tl.core.TLObject;

/**
 * Abstraction level for the following constructors:
 * <ul>
 * <li>{@link TLBaseThemeArctic}: baseThemeArctic#5b11125a</li>
 * <li>{@link TLBaseThemeClassic}: baseThemeClassic#c3a12462</li>
 * <li>{@link TLBaseThemeDay}: baseThemeDay#fbd81688</li>
 * <li>{@link TLBaseThemeNight}: baseThemeNight#b7b31ea8</li>
 * <li>{@link TLBaseThemeTinted}: baseThemeTinted#6d5f77ee</li>
 * </ul>
 *
 */
public abstract class TLAbsBaseTheme extends TLObject {
    public TLAbsBaseTheme() {
    }
}
