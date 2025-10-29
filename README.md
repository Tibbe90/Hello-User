# 🏎️ Honda Owners Club Webpage

A web project I built with **Spring Boot** and **Thymeleaf**.  
It’s a small homepage for a fictional club for people who own older Honda cars — to practice form handling, templates, and multiple pages in Spring.

---

## 🌐 What the Site Does

The site has **three pages**:

### 🏠 Home Page
- A welcoming front page introducing the club and what it’s about.  
- Just a simple intro for visitors and car enthusiasts.

### 👥 Members Page
- Shows a list of all current club members.  
- Each member displays:
  - **Name**  
  - **Age**  
  - **What they do for the club**  
  - **What car they have**  
- Members can also be **removed** from the list.

### 📝 Apply Page
- A form where new users can apply for membership.  
- It asks for:
  - Name  
  - Age  
  - What car you drive  
  - If you have a paid membership 
- When all forms are correctly filled out, the member will be added to the list.
- The input requires all fields to be filled out and that the member is at least 16 years old.

---

## ⚙️ Tech Used

- 🌱 **Spring Boot**
- 🎨 **Thymeleaf** for HTML templates
- ⚙️ **Maven** for project management
- 💅 **HTML & CSS** for structure and styling

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
