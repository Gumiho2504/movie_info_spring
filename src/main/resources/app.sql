CREATE DATABASE MOVIES_INFO

-- Create the tables

CREATE TABLE Genres (
    GenreID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100)
);

CREATE TABLE Actors (
    ActorID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100)
);

CREATE TABLE Directors (
    DirectorID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100)
);

CREATE TABLE Movies (
    MovieID INT AUTO_INCREMENT PRIMARY KEY,
    Title VARCHAR(255),
    Description TEXT,
    ReleaseDate DATE,
    Rating DECIMAL(3, 1),
    Duration INT,
    DirectorID INT,
    FOREIGN KEY (DirectorID) REFERENCES Directors(DirectorID)
);

CREATE TABLE MovieGenres (
    MovieID INT,
    GenreID INT,
    PRIMARY KEY (MovieID, GenreID),
    FOREIGN KEY (MovieID) REFERENCES Movies(MovieID),
    FOREIGN KEY (GenreID) REFERENCES Genres(GenreID)
);

CREATE TABLE MovieActors (
    MovieID INT,
    ActorID INT,
    Role VARCHAR(100),
    PRIMARY KEY (MovieID, ActorID),
    FOREIGN KEY (MovieID) REFERENCES Movies(MovieID),
    FOREIGN KEY (ActorID) REFERENCES Actors(ActorID)
);

-- Insert data into Genres table
INSERT INTO Genres (Name) VALUES
('Action'),
('Adventure'),
('Sci-Fi'),
('Crime'),
('Drama');

-- Insert data into Actors table
INSERT INTO Actors (Name) VALUES
('Leonardo DiCaprio'),
('Joseph Gordon-Levitt'),
('Christian Bale'),
('Heath Ledger');

-- Insert data into Directors table
INSERT INTO Directors (Name) VALUES
('Christopher Nolan');

-- Insert data into Movies table
INSERT INTO Movies (Title, Description, ReleaseDate, Rating, Duration, DirectorID) VALUES
('Inception', 'A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.', '2010-07-16', 8.8, 148, 1),
('The Dark Knight', 'When the menace known as the Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham.', '2008-07-18', 9.0, 152, 1);

-- Insert data into MovieGenres table
INSERT INTO MovieGenres (MovieID, GenreID) VALUES
(1, 1),
(1, 2),
(1, 3),
(2, 1),
(2, 4),
(2, 5);

-- Insert data into MovieActors table
INSERT INTO MovieActors (MovieID, ActorID, Role) VALUES
(1, 1, 'Cobb'),
(1, 2, 'Arthur'),
(2, 3, 'Bruce Wayne'),
(2, 4, 'Joker');
