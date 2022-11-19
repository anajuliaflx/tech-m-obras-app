import * as React from 'react';
import AppBar from '@mui/material/AppBar';
import Box from '@mui/material/Box';
import Toolbar from '@mui/material/Toolbar';
import Button from '@mui/material/Button';
import Typography from '@mui/material/Typography';
import Container from '@mui/material/Container';
import ConstructionIcon from '@mui/icons-material/Construction';
import AddIcon from '@mui/icons-material/Add';

function Nav() {
  return (
    <AppBar position='static'>
      <Container maxWidth="xl">
        <Toolbar disableGutters>
        <ConstructionIcon sx={{ display: { xs: 'none', md: 'flex' }, mr: 1 }} />
        <Typography
          variant="h6"
          component="a"
          noWrap
          href='/'
          sx={{
              mr: 150,
              display: { xs: 'none', sm: 'block' },
              fontFamily: 'monospace',
              fontWeight: 700,
              letterSpacing: '.3rem',
              color: 'inherit',
              textDecoration: 'none',
            }}
        >
         Obras
        </Typography>
        <Box sx={{ display: { xs: 'none', sm: 'block' } }}>
            <Button color="inherit" variant="outlined"><AddIcon /> Nova Obra</Button>
        </Box>
      </Toolbar>
      </Container>
    </AppBar>
  );
}
export default Nav;