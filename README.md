# CDP Support Chatbot

## Overview
This chatbot provides "how-to" answers for tasks related to four Customer Data Platforms (CDPs): Segment, mParticle, Lytics, and Zeotap. It retrieves information from official documentation to help users perform tasks like setting up new sources, creating user profiles, and more.

## Features
1. **How-to Question Answering**: Provides answers to questions like "How do I set up a new source in Segment?"
2. **Documentation Extraction**: Extracts relevant answers from documentation using simple keyword matching.
3. **Cross-CDP Comparison**: Compares features across different platforms.
4. **Advanced Questions**: Handles advanced configuration and use-case questions.

## Tech Stack
- **Frontend**: React.js
- **Backend**: Java (Spring Boot)
- **NLP/Indexing**: Simple keyword-based indexer for document extraction.
- **Testing**: JUnit (for backend)

## Running the Application
1. Clone the repository:
https://github.com/username/cdp-chatbot.git
2. Install dependencies and build the project:
- Frontend: `npm install` and `npm start`
- Backend: `mvn clean install` and `mvn spring-boot:run`

## Testing
- Backend tests can be run using:

## Bonus Features
- Cross-CDP comparison between platforms (e.g., Segment vs Lytics).
- Advanced how-to guides for platform-specific configurations.
Final Checklist:
Chatbot answers basic "how-to" questions using official documentation.
Backend processing with Java and Spring Boot.
Simple keyword-based indexing for documentation extraction.
Frontend with React.js for chat interface.
Unit tests and GitHub repository with detailed README.
