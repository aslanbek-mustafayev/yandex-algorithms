# HOUSES AND SHOPS <br> Yandex Algorithm Training 2.0, Session 2 (Task B)

This program calculates the **maximum distance** residents must travel from their homes to the nearest shop on a street with 10 buildings. Buildings can be houses (`1`), shops (`2`), or offices (`0`).

## Specification

**Input:**

- Ten space-separated integers (`0`, `1`, or `2`) representing building types on the street.
- Guaranteed at least one house and one shop.

**Output:**

- The largest distance any resident must walk to reach the closest shop.
- Distance between adjacent buildings is 1 unit.

**Logic:**

1. For each house (`1`), find the nearest shop (`2`) to the **left** and **right**.
2. Calculate the minimum distance to either shop for each house.
3. Track the **maximum** of these minimum distances.

## Example Input and Output

| Input (Building Types) | Output |
| :-- | :--: |
| 2 0 1 1 0 1 0 2 1 2 | 3 |

**Explanation:**
The resident in the fourth house (index 3) walks 3 units to the nearest shop at the first position.

## Resource Limits

| Resource | Limit | Used |
| :-- | :-- | :-- |
| Time limit | 1 second | 155 ms |
| Memory limit | 64 MB | 10.89 MB |

## License

This implementation is based on a problem from **Yandex.Algorithm Training 2.0, Session 2 (Task B)**.
Original problem © Yandex.
