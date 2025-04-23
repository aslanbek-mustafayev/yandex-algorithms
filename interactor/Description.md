## Program Description

This program determines the final verdict of an interactive programming problem testing system based on three inputs: the program's exit code, the interactor's verdict, and the checker's verdict. It follows specific rules to compute the result efficiently.

### Key Logic

1. **Input Handling**: Reads three integers (`r` = exit code, `i` = interactor verdict, `c` = checker verdict).
2. **Decision Rules**:
    - If the interactor verdict is `0` and the exit code is non-zero → verdict is `3`.
    - If the interactor verdict is `0` (with zero exit code) or `1` → verdict matches the checker's verdict.
    - If the interactor verdict is `4` and exit code is non-zero → verdict is `3`; otherwise, it is `4`.
    - If the interactor verdict is `6` → verdict is `0`.
    - If the interactor verdict is `7` → verdict is `1`.
    - For all other cases → verdict matches the interactor's verdict.

### Example Scenarios

| Input (r, i, c) | Output | Explanation |
| :-- | :-- | :-- |
| `0, 0, 0` | `0` | Exit code is zero → checker's verdict `0` applies. |
| `-1, 0, 1` | `3` | Non-zero exit code with interactor `0` → verdict `3`. |
| `42, 1, 6` | `6` | Interactor `1` → checker's verdict `6` applies. |
| `44, 7, 4` | `1` | Interactor `7` → verdict is `1`. |
