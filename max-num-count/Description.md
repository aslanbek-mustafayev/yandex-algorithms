# COUNT OF MAXIMUM ELEMENTS <br> Yandex Algorithm Training 2.0, Session 2 (Task A)

This program counts how many elements in a sequence of natural numbers are equal to the maximum value. The sequence is terminated by a `0`, which is not included in the calculation.

## Specification

**Input:**

- A sequence of natural numbers (positive integers) ending with `0`.
- Maximum sequence length: 10,000 numbers (excluding the terminating `0`).

**Output:**

- The count of elements equal to the maximum value in the sequence.

**Logic:**

1. Read numbers until `0` is encountered.
2. Track the current maximum value and its occurrence count.
3. Update the maximum and reset the counter when a larger number is found.
4. Increment the counter for each subsequent occurrence of the current maximum.

## Example Inputs and Outputs

| Input Sequence | Output |
| :--: | :--: |
| 1<br>7<br>9<br>0 | 1 |
| 1<br>3<br>3<br>1<br>0 | 2 |

## Resource Limits

| Resource | Limit | Used |
| :-- | :-- | :-- |
| Time limit | 1 second | 227 ms |
| Memory limit | 64 MB | 11.67 MB |

## License

This implementation is based on a problem from **Yandex.Algorithm Training 2.0, Session 2 (Task A)**.
Original problem © Yandex.
