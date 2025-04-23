# BENCHES IN THE ATRIUM <br> Yandex Algorithm Training 2.0, Session 2 (Task D)

This program determines which granite blocks must remain under a bench to prevent it from falling, while removing the maximum number of blocks. The bench remains stable if there are blocks (or parts of blocks) both to the left and right of its center.

## Specification

**Input:**

- **L**: Bench length (1 ≤ L ≤ 10,000)
- **K**: Number of blocks (1 ≤ K ≤ 10,000)
- **Positions**: K distinct integers (0 ≤ positions < L) in ascending order

**Output:**

- Positions of blocks to keep, ordered as in the input.

**Logic:**

1. **Even L**:
    - Center is between positions `L/2 - 1` and `L/2`.
    - Keep the rightmost block ≤ `L/2 - 1` and the leftmost block ≥ `L/2`.
2. **Odd L**:
    - Center is at position `(L-1)/2`.
    - If a block exists at the center, keep it.
    - Otherwise, keep the rightmost block < center and the leftmost block > center.

## Example Inputs and Outputs

| Input (L, K, Positions) | Output |
| :-- | :--: |
| 5 2<br>0 2 | 2 |
| 13 4<br>1 4 8 11 | 4 8 |
| 14 6<br>1 6 8 11 12 13 | 6 8 |

## Resource Limits

| Resource | Limit | Used |
| :-- | :-- | :-- |
| Time limit | 1 second | 269 ms |
| Memory limit | 64 MB | 16.14 MB |

## License

This implementation is based on a problem from **Yandex.Algorithm Training 2.0, Session 2 (Task D)**.
Original problem © Yandex.
