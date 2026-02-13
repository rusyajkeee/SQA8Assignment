# Smoke Test Suite - Tricentis Demo Web Shop

**Website:** https://demowebshop.tricentis.com  
**Purpose:** Quick health check (10–20 checks) to verify core functionality

---

## Smoke Test Cases (15 checks)

| ID     | Check                   | Steps                                           | Expected Result                              | Pass/Fail |
| ------ | ----------------------- | ----------------------------------------------- | -------------------------------------------- | --------- |
| SM-M01 | Homepage loads          | Navigate to https://demowebshop.tricentis.com   | Page loads; title contains "Demo Web Shop"   |           |
| SM-M02 | Logo visible            | Check header area                               | Tricentis Demo Web Shop logo displayed       |           |
| SM-M03 | Register link           | Click "Register" in header                      | Navigates to registration page               |           |
| SM-M04 | Log in link             | Click "Log in" in header                        | Navigates to login page                      |           |
| SM-M05 | Shopping cart link      | Click "Shopping cart"                           | Navigates to cart page                       |           |
| SM-M06 | Search – valid          | Enter "computer" in search, submit              | Results displayed; products shown            |           |
| SM-M07 | Search – product exists | Search "laptop"                                 | At least one laptop product in results       |           |
| SM-M08 | Category navigation     | Click "Books"                                   | Books category page loads                    |           |
| SM-M09 | Product detail          | Click any product (e.g. Blue and green Sneaker) | Product detail page loads with Add to cart   |           |
| SM-M10 | Add to cart             | Add Blue and green Sneaker to cart              | Success message "The product has been added" |           |
| SM-M11 | Cart count updates      | After add to cart, check header                 | Cart count shows (1) or more                 |           |
| SM-M12 | Newsletter visible      | Check footer                                    | Newsletter signup form visible               |           |
| SM-M13 | Footer links            | Click "Contact us"                              | Contact page loads                           |           |
| SM-M14 | Wishlist link           | Click "Wishlist"                                | Wishlist page loads (empty or with items)    |           |
| SM-M15 | Sitemap                 | Click "Sitemap" in footer                       | Sitemap page loads                           |           |

---

## Execution Notes

- Execute manually in Chrome (or preferred browser).
- Document Pass/Fail for each check.
- Any Fail indicates the application is not ready for full regression.
