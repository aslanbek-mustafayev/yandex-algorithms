# PALINDROME CONVERSION <br> Yandex Algorithm Training 2.0, Session 2 (Task C)

This program calculates the minimum cost to convert a string into a palindrome by replacing mismatched characters. Each replacement costs 1 unit.

## Specification

**Input:**

- A non-empty string of lowercase Latin letters (length ≤ 10⁴).

**Output:**

- Minimum cost (number of replacements) to make the string a palindrome.

**Logic:**

1. Compare symmetric character pairs from the start and end of the string.
2. For each mismatched pair, increment the cost by 1 (since only one character needs replacement per pair).
3. Iterate only through the first half of the string.

## Example Inputs and Outputs

| Input | Output |
| :--: | :--: |
| a | 0 |
| ab | 1 |
| cognitive | 4 |

## Resource Limits

| Resource | Limit | Used |
| :-- | :-- | :-- |
| Time limit | 2 seconds | 227 ms |
| Memory limit | 512 MB | 11.67 MB |

## License

This implementation is based on a problem from **Yandex.Algorithm Training 2.0, Session 2 (Task C)**.
Original problem © Yandex.
