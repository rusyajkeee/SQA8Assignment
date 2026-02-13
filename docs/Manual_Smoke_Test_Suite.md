# Smoke Test Suite - Tricentis Demo Web Shop

**Website:** https://demowebshop.tricentis.com  
**Purpose:** Quick health check (10–20 checks) to verify core functionality

---

## Smoke Test Cases (15 checks)

| ID     | Check                   | Steps                                           | Expected Result                              | Pass/Fail |
| ------ | ----------------------- | ----------------------------------------------- | -------------------------------------------- | --------- |
| SM-M01 | Homepage loads          | Navigate to https://demowebshop.tricentis.com   | Page loads; title contains "Demo Web Shop"   | Pass      |
| SM-M02 | Logo visible            | Check header area                               | Tricentis Demo Web Shop logo displayed       | Pass      |
| SM-M03 | Register link           | Click "Register" in header                      | Navigates to registration page               | Pass      |
| SM-M04 | Log in link             | Click "Log in" in header                        | Navigates to login page                      | Pass      |
| SM-M05 | Shopping cart link      | Click "Shopping cart"                           | Navigates to cart page                       | Pass      |
| SM-M06 | Search – valid          | Enter "computer" in search, submit              | Results displayed; products shown            | Pass      |
| SM-M07 | Search – product exists | Search "laptop"                                 | At least one laptop product in results       | Pass      |
| SM-M08 | Category navigation     | Click "Books"                                   | Books category page loads                    | Pass      |
| SM-M09 | Product detail          | Click any product (e.g. Blue and green Sneaker) | Product detail page loads with Add to cart   | Pass      |
| SM-M10 | Add to cart             | Add Blue and green Sneaker to cart              | Success message "The product has been added" | Pass      |
| SM-M11 | Cart count updates      | After add to cart, check header                 | Cart count shows (1) or more                 | Pass      |
| SM-M12 | Newsletter visible      | Check footer                                    | Newsletter signup form visible               | Pass      |
| SM-M13 | Footer links            | Click "Contact us"                              | Contact page loads                           | Pass      |
| SM-M14 | Wishlist link           | Click "Wishlist"                                | Wishlist page loads (empty or with items)    | Pass      |
| SM-M15 | Sitemap                 | Click "Sitemap" in footer                       | Sitemap page loads                           | Pass      |

---

## Execution Notes

- Execute manually in Chrome (or preferred browser).
- Document Pass/Fail for each check.
- Any Fail indicates the application is not ready for full regression.
