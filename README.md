# 🏎️ Honda vintage car club Webpage

A web project I built with **Spring Boot** and **Thymeleaf** for a school assignment.  
- It’s a small homepage for a fictional club for people who own older Honda cars — to practice form handling, templates, and multi page navigation in Spring.
- I considered using Spring Security for the admin functions, but I did not have time to completely understand how to use it before deadline. In this version, javascript will set a user Id to a variable in the browser, Java will check if this user Id matches an admin Id on the backend. If successful the admin functions will be implemented in the DOM
---
**Currently the admin login is:**
- admin
- admin
---

## 🌐 What the Site Does

The site has **three pages**:

### 🏠 Home Page
- A welcoming front page introducing the club and what it’s about.  
- Just a simple intro for visitors and car enthusiasts.
- From here you can log in, when logged in you will unlock additional functions and the add members page.

### 👥 Members Page
- Shows a list of all current club members.  
- Each member displays:
  - **Name**  
  - **Age**  
  - **What they do for the club**  
  - **What car they have**
  - **Are they a paying member**
- Members can be removed by admin.

### 📝 Add members Page
- A form where the admin can add more members.  
- It asks for:
  - Name  
  - Age
  - Club Role
  - What car they drive  
  - If you have a paid membership 
- When all forms are correctly filled out, the member will be added to the list.
- The input requires all fields to be filled out and that the member is at least 16 years old.

---

## ⚙️ Tech Used

- 🌱 **Spring Boot**
- 🎨 **Thymeleaf** for HTML templates
- ⚙️ **Maven** for project management
- 💅 **HTML & CSS** for structure and styling
- ⚡ **JavaScript** for interactive elements (login function)

> Note: No database yet — members are stored temporarily in memory.

---

## 🚀 How to Run It

1. **Clone this repo**
    - git clone https://github.com/Tibbe90/Hello-User.git
2. **Run the project**
   - Run from your preferred code editor. I have been using Visual Studio Code
3. **Open in your browser**
    - http://localhost:8080/home
---

🧑‍💻 Author: Jonas Tibbelin
- Created for a school assignment project with Spring Boot & Thymeleaf.
