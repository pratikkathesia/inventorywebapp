# inventorywebapp
A Simple inventory web app with spring boot

## Java - 17
## Spring boot - 3.0.5 
## Dependency Added 
-	Spring data JPA
-	Thymeleaf
-	Spring starter Web
-	Spring boot dev tools
-	MySQL Driver
## What can you do with Stark inventory solution?
### Home page (/home)
-	Available Parts
-	Main table with all available parts list
-	Update product details and delete
-	Add product (Last row) – Go to Add new product form

![home](https://user-images.githubusercontent.com/56655031/236650874-108d7449-d08f-4cd9-a590-3d5f41b1811f.PNG)

### Delete product page (/home/delete-product/{pId})
-	Delete the product 
-	Update quantity in database and go to home page

### Add product page (/home/add-new-product)
-	Go to Add Product Form

![add new](https://user-images.githubusercontent.com/56655031/236650941-cd7e0a55-d13e-4410-9276-b0c333b7324e.PNG)

### Process Add product page (/home/addNewProduct)
-	Get all details from form
-	Save it to database 
-	Return to home

### Update product details (/home/update_product_details/{pId})
-	Go to updateProduct Form

### Update Product Details (/home/updateProduct/{pId})
-	Product details 
-	Enter quantity
-	Click submit 
-	Update quantity in database 
-	Go to home page

![update](https://user-images.githubusercontent.com/56655031/236650948-2941528d-4392-44b2-95b1-e967935052ec.PNG)

