# DATES <br> Yandex Algorithm Training 2.0, Session 1 (Task C)

This program detects ambiguous date representations that could be interpreted as either European (day/month/year) or American (month/day/year) format. A date is ambiguous if both interpretations are valid.

## Specification

**Input:**
Three integers provided in order:

- **x**: day or month candidate (1 ≤ x ≤ 31)
- **y**: day or month candidate (1 ≤ y ≤ 31)
- **z**: year (1970 ≤ z ≤ 2069)

At least one of the two possible interpretations is guaranteed to be a valid date.

**Logic:**

- The date is ambiguous if both x and y are ≤ 12 (both could be months), or if x = y.
- The date is unambiguous if only one of x or y can be a valid month (≤ 12), or if x = y.


## Example Inputs and Outputs

| x | y | z | Output |
| :--: | :--: | :--: | :--: |
| 1 | 2 | 2003 | 0 |
| 2 | 29 | 2008 | 1 |

## Resource Limits

| Resource | Limit | Used |
| :-- | :-- | :-- |
| Time limit | 2 seconds | 162 ms |
| Memory limit | 512 MB | 10.94 MB |

## License

This implementation is based on a problem from **Yandex.Algorithm Training 2.0, Session 1 (Task C)**.
Original problem © Yandex.
