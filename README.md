
<br />
<div align="center">

  <h1 align="center">Project Fullstack Tutorial List System CRUD</h1>

  <h3> <a href="https://tutorial-list-frontend-a78b65332e3c.herokuapp.com/" target="_blank">Live Website</a></h3>

  <p align="center">
    comprehensive tutorial management system designed to facilitate the organization and display of tutorial lists
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgments">Acknowledgments</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

https://github.com/KelvinPhu/Project-Fullstack-Tutorial-List-System-CRUD/assets/102346766/38795fed-3832-4c64-aed2-26daf8a469cf

The Project-Fullstack-Tutorial-List-System-CRUD is a comprehensive tutorial management system designed to facilitate the organization and display of tutorial lists entered by users. 

#### Key Features:
- **Create Tutorial List:** Users can create new tutorial lists, providing titles and descriptions for each tutorial.
- **Display Tutorial Lists:** The main page displays all tutorial lists entered by users, allowing easy access to tutorial information.
- **Edit Tutorial Lists:** Users can edit existing tutorial lists, modifying titles, descriptions, or other details as needed.
- **Publish and Unpublish:** Tutorial lists can be published or unpublished, controlling their visibility to other users.
- **Delete Tutorial Lists:** Users have the ability to delete tutorial lists, removing them from the system entirely.

#### Technology Stack:
This fullstack project incorporates the following technologies:
- **Backend:** Java with Spring Framework
- **Frontend:** ReactJS
- **Database:** MongoDB

The integration of Java and Spring for the backend, along with ReactJS for the frontend, ensures a robust and user-friendly experience for managing tutorial lists effectively. The use of MongoDB provides a flexible and scalable database solution to store tutorial data securely.

With its intuitive interface and comprehensive functionality, the Project-Fullstack-Tutorial-List-System-CRUD simplifies tutorial management tasks, making it an ideal choice for organizing and accessing tutorial information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

This section should list any major frameworks/libraries used to bootstrap your project. Leave any add-ons/plugins for the acknowledgements section. Here are a few examples.

<p style="display: inline-block;" align="center">
  <kbd>
    <kbd>Programming Languages</kbd>
    <br>
    <br>
    <img width="30px" alt="java" src="https://raw.githubusercontent.com/devicons/devicon/55609aa5bd817ff167afce0d965585c92040787a/icons/java/java-original.svg" />
    <img width="30px" alt="spring" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" />
    <img width="30px" alt="reactjs" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/react/react-original.svg" />
    <img width="30px" alt="MySQL" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mongodb/mongodb-plain.svg" />
  </kbd>

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

The Project-Fullstack-Tutorial-List-System-CRUD is a comprehensive tutorial management system designed to streamline the organization and access of tutorial lists entered by users. 
This guide will walk you through the steps to set up and run the project locally on your machine.

### Prerequisites

- Java Development Kit (JDK): Ensure you have JDK 11 or newer installed on your machine.
- MongoDB Database: Make sure MongoDB is installed and running.
- Node.js and npm: Required for running the ReactJS frontend.
- IDE or Editor: IntelliJ IDEA or eclipse for backend and VS Code for frontend development are recommended.

### Backend Setup (Spring Boot)
* Clone the Repository: Clone the project repository to your local machine.
  ```sh
  git clone [Your Repository URL]
  cd [Your Project's Backend Directory]
  ```

* Database Configuration: Open src/main/resources/application.yaml (or application.properties) in backend project and configure MongoDB database connection:
  ```sh
  # Set up DataBase Connection - mongoDB
  spring:
    data:
      mongodb:
        uri: mongodb://localhost:27017/Project_TutorialListCRUD
    
    autoconfigure:
      exclude: org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration
  ```

* Run the Application: You can run the Spring Boot application directly from your IDE by running the main class annotated with @SpringBootApplication, or use Maven from the command line:
  ```sh
  ./mvnw spring-boot:run
  ```
  
* Verify Backend: Once started, ensure the backend is running correctly by accessing or the configured port.
    ```sh
  http://localhost:8080
  ```

### Frontend Setup (ReactJS)

* Navigate to the Frontend Directory: After setting up the backend, open a new terminal window and navigate to your project's frontend directory.
  ```sh
  cd [Your Project's Frontend Directory]
  ```

* Install Dependencies: Install the required npm packages.
  ```sh
  npm install
  ```

* Environment Variables: Create a .env file in the root of your frontend project if you have any environment-specific settings (e.g., the backend API URL).
  ```sh
  REACT_APP_API_BASE_URL=http://localhost:8080/api
  ```
  
* Run the Frontend: Start the React application.
    ```sh
  npm start
  ```

### Testing the Full-Stack Application

* Access the Application: With both backend and frontend running, open your browser and go to `$ http://localhost:8081`. You should see your full-stack application running.
  
* Use the Application: Test the CRUD functionalities by creating, reading, updating, and deleting employee entries.

<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Troubleshooting

* Database Connection: If the backend can't connect to the database, check your MySQL service and ensure the credentials in `$ application.properties` are correct.
* Port Conflicts: If you encounter port conflicts (e.g., if port 8080 or 3000 is already in use), you can change the port in the backend's `$ application.properties` file `$ (server.port=yourNewPort)` and the frontend's `$ .env` file, if applicable.
* Dependencies: If you face issues with missing or incompatible npm packages, ensure you've run `$ npm install` from within the frontend directory and that your `$ package.json` file is correctly set up.

<!-- USAGE EXAMPLES -->
## Usage

The Project-Fullstack-Tutorial-List-System-CRUD provides a user-friendly interface to manage tutorial lists efficiently. Below are the main functionalities and how to use them:

#### 1. Create Tutorial List:
   - Navigate to the "Create Tutorial" page.
   - Enter the title and description of the tutorial.
   - Click on the "Submit" button to create the tutorial list.

`$ Example:`

![2](https://github.com/KelvinPhu/Project-Fullstack-Tutorial-List-System-CRUD/assets/102346766/6d482a2c-46cc-4769-82d9-568c61d53f37)

`$ code example`
```
package com.ProjectFullStack.TutorialSystemCRUD.ProjectFullstackCRUD.Controller;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:8081")
public class TutorialListController {

	@Autowired
	private TutorialListService tutorialListService;
	
	@GetMapping("/tutorials")
	@ResponseStatus(HttpStatus.OK)
	public Flux<TutorialList> getAllTutorials(@RequestParam(required = false) String title) {
      ...
	}

	@GetMapping("/tutorials/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Mono<TutorialList> getTutorialById(@PathVariable("id") String id) {
	    ...
	}
	
	@PostMapping("/tutorials")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<TutorialList> createTutorial(@RequestBody TutorialList tutorialList) {
	    ...
	}
	
	@PutMapping("/tutorials/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Mono<TutorialList> updateTutorial(@PathVariable("id") String id, @RequestBody TutorialList tutorial) {
	    ...
	}
	
	@DeleteMapping("/tutorials/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Mono<Void> deleteTutorial(@PathVariable("id") String id) {
	    ...
	}

	@DeleteMapping("/tutorials")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public Mono<Void> deleteAllTutorials() {
	    ...
	}
	
	@GetMapping("/tutorials/published")
	@ResponseStatus(HttpStatus.OK)
	public Flux<TutorialList> findByPublished() {
	    ...
	}
}

```

#### 2. View Tutorial Lists:
   - On the main page, all tutorial lists are displayed.
   - Each tutorial list includes its title, description, and publication status.

![3](https://github.com/KelvinPhu/Project-Fullstack-Tutorial-List-System-CRUD/assets/102346766/d94ce7bc-8092-4b04-9132-7f99a3f9225f)


#### 3. Edit Tutorial List:
   - Click on the tutorial list you want to edit from the main page.
   - Update the title, description, or publication status as needed.
   - Click on the "Update" button to save the changes.

![4](https://github.com/KelvinPhu/Project-Fullstack-Tutorial-List-System-CRUD/assets/102346766/9290dec5-2663-46a8-b0f1-b7e8d598a245)

#### 4. Publish/Unpublish Tutorial List:
   - To publish or unpublish a tutorial list, click on the corresponding option in the edit mode.
   - Published tutorial lists are visible to all users, while unpublished lists are only visible to the creator.

![5](https://github.com/KelvinPhu/Project-Fullstack-Tutorial-List-System-CRUD/assets/102346766/f4578aeb-3fb1-4515-bf43-7cb071deadec)

#### 5. Delete Tutorial List:
   - To delete a tutorial list, click on the delete option in the edit mode.
   - Confirm the deletion when prompted.

#### Additional Notes:
   - Ensure you have proper authentication and authorization configured to access and perform actions on the tutorial lists based on user roles.
   - Customize the user interface and functionality according to your project requirements by modifying the React components and backend API endpoints.
   - Regularly backup your database to prevent data loss and ensure data integrit

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

Developing a roadmap for Project-FullStack-Employee-System-CRUD helps guide the development process and outlines key milestones. Here's the projected roadmap:

#### Phase 1: Project Setup and Basic Functionality
- [x] Set up the backend with Java and Spring Framework.
- [x] Implement CRUD operations for managing tutorial lists.
- [x] Develop the frontend with ReactJS.
- [x] Create UI components for displaying, creating, editing, and deleting tutorial lists.

#### Phase 2: Authentication and Authorization
- [x] Implement user authentication using JWT tokens.
- [x] Configure Spring Security to handle authentication and authorization.
- [x] Define user roles and permissions for accessing tutorial lists.
- [x] Secure API endpoints to restrict unauthorized access.

#### Phase 3: Enhanced User Experience
- [x] Improve the UI/UX of the application for better usability.
- [x] Implement pagination for displaying large sets of tutorial lists.
- [x] Add search functionality to allow users to search for specific tutorial lists.
- [x] Introduce error handling and validation to enhance user feedback.

#### Phase 4: Performance Optimization and Deployment
- [x] Optimize backend APIs and frontend components for improved performance.
- [x] Test the application thoroughly to ensure functionality and reliability.
- [x] Set up CI/CD pipelines for automated testing and deployment.
- [x] Deploy the application to a production environment for public access.

#### Phase 5: Future Enhancements
- [ ] Implement real-time updates using WebSocket for collaborative editing.
- [ ] Integrate email notifications for important events (e.g., new tutorial created, tutorial updated).
- [ ] Enhance security measures to protect against common vulnerabilities (e.g., XSS, CSRF).
- [ ] Explore adding additional features such as user comments and ratings for tutorials.

#### Phase 6: Community Engagement and Support
- [ ] Create documentation and user guides to assist users in utilizing the application.
- [ ] Establish a community forum or support channel for users to ask questions and provide feedback.
- [ ] Collaborate with contributors to address issues, add new features, and improve the overall project.
- [ ] Continuously monitor and update the project to meet evolving user needs and technology advancements.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are greatly appreciated.

### How to Contribute

1. **Fork** the repository.
2. **Clone** the forked repository to your local machine.
    ```bash
    git clone https://github.com/your-username/Project-FullStack-Employee-System-CRUD.git
    ```
3. **Create a new branch** for your feature or bug fix.
    ```bash
    git checkout -b feature/your-feature-name
    ```
4. **Make changes** to the codebase.
5. **Test** your changes thoroughly.
6. **Commit** your changes.
    ```bash
    git commit -m "Add your commit message here"
    ```
7. **Push** your changes to your fork.
    ```bash
    git push origin feature/your-feature-name
    ```
8. Create a new **Pull Request** from your forked repository to the original repository.
9. Provide a descriptive title and detailed description for your Pull Request.
10. Wait for maintainers to review your Pull Request and address any feedback if necessary.
11. Once approved, your changes will be merged into the main project.

### Guidelines

- Follow the project's coding style and guidelines.
- Ensure your code is well-tested.
- Provide detailed and clear commit messages.
- Be respectful to others and their contributions.
- If you're unsure about something, don't hesitate to ask for clarification or guidance.

### Found a Bug or Have a Feature Request?

If you encounter any bugs or have suggestions for new features, please [open an issue](https://github.com/your-username/Project-FullStack-Employee-System-CRUD/issues) on GitHub. Provide detailed information about the problem or feature request, including steps to reproduce for bugs.

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- CONTACT -->
## Contact

Huynh Thien Phu - [@kelvin_hnh](https://twitter.com/kelvin_hnh) - phuhuynh197@gmail.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- ACKNOWLEDGMENTS -->
## Acknowledgments

We would like to express our gratitude to the following individuals and organizations for their contributions to this project:

- [Open Source Community](https://opensource.org/): For providing a wealth of knowledge and resources to the community.
- [Stack Overflow](https://stackoverflow.com/): For being an invaluable resource for troubleshooting and problem-solving.
- [GitHub](https://github.com/): For providing an excellent platform for collaboration and version control.
- [ReactJS Documentation](https://reactjs.org/): For comprehensive documentation and tutorials on ReactJS.
- [Spring Framework Documentation](https://spring.io/): For extensive documentation and guides on the Spring Framework.
- [Bootstrap Documentation](https://getbootstrap.com/): For clear and concise documentation on Bootstrap.
- [Axios Documentation](https://axios-http.com/): For detailed documentation and examples on Axios.
- [MySQL Documentation](https://dev.mysql.com/doc/): For comprehensive documentation on MySQL.

<p align="right">(<a href="#readme-top">back to top</a>)</p>
