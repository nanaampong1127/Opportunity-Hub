import React, { useEffect, useState } from 'react';
import './App.css';

function App() {
    // State to hold the jobs data
    const [jobs, setJobs] = useState([]);

    // Fetch job data when the component mounts
    useEffect(() => {
        // Adjust the URL to your backend API
        fetch('http://localhost:8080/api/jobs')
            .then(response => response.json())
            .then(data => setJobs(data))
            .catch(error => console.error('Error fetching jobs:', error));
    }, []); // Empty dependency array means this runs once when the component mounts

    return (
      <div className="App container mt-4">
        <h1 className="text-center">Job Listings</h1>
        <ul className="list-group">
            {jobs.length > 0 ? (
                jobs.map((job, index) => (
                    <li key={index} className="list-group-item">{job}</li>
                ))
            ) : (
                <p className="text-center">No jobs available at the moment.</p>
            )}
        </ul>
      </div>

        
    );

    
}

export default App;
