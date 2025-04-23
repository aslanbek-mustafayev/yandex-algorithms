# INTERACTOR <br> Yandex Algorithm Training 2.0, Session 1 (Task A)

This program determines the final system verdict for interactive programming problems by evaluating the exit code, interactor verdict, and checker verdict according to a fixed set of rules.

## Specification

**Input:**
Three integers provided in order:

- **Exit code** (`r`): from -128 to 127
- **Interactor verdict** (`i`): from 0 to 7
- **Checker verdict** (`c`): from 0 to 7

**Logic:**

- If interactor verdict is 0:
    - If exit code ≠ 0: verdict = 3
    - Else: verdict = checker verdict
- If interactor verdict is 1: verdict = checker verdict
- If interactor verdict is 4:
    - If exit code ≠ 0: verdict = 3
    - Else: verdict = 4
- If interactor verdict is 6: verdict = 0
- If interactor verdict is 7: verdict = 1
- Otherwise: verdict = interactor verdict


## Example Inputs and Outputs

| Exit code (r) | Interactor (i) | Checker (c) | Output |
| :--: | :--: | :--: | :--: |
| 0 | 0 | 0 | 0 |
| -1 | 0 | 1 | 3 |
| 42 | 1 | 6 | 6 |
| 44 | 7 | 4 | 1 |
| 1 | 4 | 0 | 3 |
| -3 | 2 | 4 | 2 |

## Resource Limits

| Resource | Limit | Used |
| :-- | :-- | :-- |
| Time limit | 1 second | 165 ms |
| Memory limit | 256 MB | 10.93 MB |

## License

This implementation is based on a problem from **Yandex.Algorithm Training 2.0, Session 1 (Task A)**.
Original problem © Yandex.
