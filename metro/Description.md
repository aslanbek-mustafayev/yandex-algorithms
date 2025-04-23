# RING METRO LINE <br> Yandex Algorithm Training 2.0, Session 1 (Task B)

This program calculates the minimal number of intermediate stations a passenger must pass through on a circular metro line to travel from a starting station to a destination station.

## Specification

**Input:**
Three integers provided in order:

- **N**: total number of stations on the ring (1 ≤ N ≤ 100)
- **i**: starting station number (1 ≤ i ≤ N)
- **j**: destination station number (1 ≤ j ≤ N, i ≠ j)

Stations are numbered consecutively from 1 to N, with the first and Nth stations adjacent.

**Logic:**

- The passenger can travel in either direction around the ring.
- The minimal number of intermediate stations (excluding the starting and destination stations) is calculated as the minimum of the two possible paths.


## Example Inputs and Outputs

| N | i | j | Output |
| :--: | :--: | :--: | :--: |
| 100 | 5 | 6 | 0 |
| 10 | 1 | 9 | 1 |

## Resource Limits

| Resource | Limit | Used |
| :-- | :-- | :-- |
| Time limit | 1 second | 169 ms |
| Memory limit | 64 MB | 10.99 MB |

## License

This implementation is based on a problem from **Yandex.Algorithm Training 2.0, Session 1 (Task B)**.
Original problem © Yandex.
